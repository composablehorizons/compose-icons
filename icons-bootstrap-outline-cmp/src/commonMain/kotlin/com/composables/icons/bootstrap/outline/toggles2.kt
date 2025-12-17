package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Toggles2: ImageVector
    get() {
        if (_Toggles2 != null) return _Toggles2!!
        
        _Toggles2 = ImageVector.Builder(
            name = "toggles2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.465f, 10f)
                horizontalLineTo(12f)
                arcToRelative(2f, 2f, 0f, true, true, 0f, 4f)
                horizontalLineTo(9.465f)
                curveToRelative(0.34f, -0.588f, 0.535f, -1.271f, 0.535f, -2f)
                reflectiveCurveToRelative(-0.195f, -1.412f, -0.535f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 15f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                moveToRelative(0f, 1f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                moveToRelative(0.535f, -10f)
                arcToRelative(4f, 4f, 0f, false, true, -0.409f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(2.126f)
                quadToRelative(0.138f, -0.534f, 0.41f, -1f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4f)
                arcToRelative(4f, 4f, 0f, true, true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 8f, 0f)
            }
        }.build()
        
        return _Toggles2!!
    }

private var _Toggles2: ImageVector? = null

