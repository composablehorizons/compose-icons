package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.UniversalAccessCircle: ImageVector
    get() {
        if (_UniversalAccessCircle != null) return _UniversalAccessCircle!!
        
        _UniversalAccessCircle = ImageVector.Builder(
            name = "universal-access-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4.143f)
                arcTo(1.071f, 1.071f, 0f, true, false, 8f, 2f)
                arcToRelative(1.071f, 1.071f, 0f, false, false, 0f, 2.143f)
                moveToRelative(-4.668f, 1.47f)
                lineToRelative(3.24f, 0.316f)
                verticalLineToRelative(2.5f)
                lineToRelative(-0.323f, 4.585f)
                arcTo(0.383f, 0.383f, 0f, false, false, 7f, 13.14f)
                lineToRelative(0.826f, -4.017f)
                curveToRelative(0.045f, -0.18f, 0.301f, -0.18f, 0.346f, 0f)
                lineTo(9f, 13.139f)
                arcToRelative(0.383f, 0.383f, 0f, false, false, 0.752f, -0.125f)
                lineTo(9.43f, 8.43f)
                verticalLineToRelative(-2.5f)
                lineToRelative(3.239f, -0.316f)
                arcToRelative(0.38f, 0.38f, 0f, false, false, -0.047f, -0.756f)
                horizontalLineTo(3.379f)
                arcToRelative(0.38f, 0.38f, 0f, false, false, -0.047f, 0.756f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, 16f)
                arcTo(8f, 8f, 0f, false, false, 8f, 0f)
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, true, 14f, 0f)
                arcTo(7f, 7f, 0f, false, true, 1f, 8f)
            }
        }.build()
        
        return _UniversalAccessCircle!!
    }

private var _UniversalAccessCircle: ImageVector? = null

