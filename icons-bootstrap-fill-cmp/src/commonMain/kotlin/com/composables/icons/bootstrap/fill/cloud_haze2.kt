package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.CloudHaze2: ImageVector
    get() {
        if (_CloudHaze2 != null) return _CloudHaze2!!
        
        _CloudHaze2 = ImageVector.Builder(
            name = "cloud-haze2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 2f)
                arcToRelative(5f, 5f, 0f, false, true, 4.905f, 4.027f)
                arcTo(3f, 3f, 0f, false, true, 13f, 12f)
                horizontalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, false, true, 0.035f, 9f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(0.035f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 3.871f, -2.977f)
                arcTo(5f, 5f, 0f, false, true, 8.5f, 2f)
                moveToRelative(-6f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveTo(0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _CloudHaze2!!
    }

private var _CloudHaze2: ImageVector? = null

