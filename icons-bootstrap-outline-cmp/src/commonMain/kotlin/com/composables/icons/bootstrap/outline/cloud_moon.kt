package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CloudMoon: ImageVector
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
                moveTo(7f, 8f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.5f, 3.555f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.625f, 0.492f)
                arcTo(1.503f, 1.503f, 0f, false, true, 13f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, true, true, 0.1f, -3.998f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.509f, -0.375f)
                arcTo(3.5f, 3.5f, 0f, false, true, 7f, 8f)
                moveToRelative(4.473f, 3f)
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

