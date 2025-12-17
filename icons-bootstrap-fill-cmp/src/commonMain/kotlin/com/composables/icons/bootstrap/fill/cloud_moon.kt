package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CloudMoon: ImageVector
    get() {
        if (_CloudMoon != null) return _CloudMoon!!
        
        _CloudMoon = ImageVector.Builder(
            name = "cloud-moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.473f, 11f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -8.72f, -0.99f)
                arcTo(3f, 3f, 0f, false, false, 3f, 16f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.286f, 1.778f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.565f, -0.755f)
                arcToRelative(4.595f, 4.595f, 0f, false, false, -3.18f, 5.003f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 1.055f, 0.209f)
                arcTo(3.6f, 3.6f, 0f, false, true, 9.83f, 2.617f)
                arcToRelative(4.593f, 4.593f, 0f, false, false, 4.31f, 5.744f)
                arcToRelative(3.58f, 3.58f, 0f, false, true, -2.241f, 0.634f)
                quadToRelative(0.244f, 0.477f, 0.394f, 1f)
                arcToRelative(4.59f, 4.59f, 0f, false, false, 3.624f, -2.04f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.565f, -0.755f)
                arcToRelative(3.593f, 3.593f, 0f, false, true, -4.065f, -5.422f)
                close()
            }
        }.build()
        
        return _CloudMoon!!
    }

private var _CloudMoon: ImageVector? = null

