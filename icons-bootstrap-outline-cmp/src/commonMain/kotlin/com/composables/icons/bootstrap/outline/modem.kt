package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Modem: ImageVector
    get() {
        if (_Modem != null) return _Modem!!
        
        _Modem = ImageVector.Builder(
            name = "modem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.404f, 1.497f)
                curveToRelative(0.35f, 0.305f, 0.872f, 0.678f, 1.628f, 1.056f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 16f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.224f, -0.947f)
                curveToRelative(0.756f, -0.378f, 1.277f, -0.75f, 1.628f, -1.056f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.5f, 12.5f)
                close()
                moveTo(7f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-11f)
                arcTo(0.5f, 0.5f, 0f, false, false, 9f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
        }.build()
        
        return _Modem!!
    }

private var _Modem: ImageVector? = null

