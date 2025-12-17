package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Landmark: ImageVector
    get() {
        if (_Landmark != null) return _Landmark!!
        
        _Landmark = ImageVector.Builder(
            name = "landmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(501.62f, 92.11f)
                lineTo(267.24f, 2.04f)
                arcToRelative(31.958f, 31.958f, 0f, false, false, -22.47f, 0f)
                lineTo(10.38f, 92.11f)
                arcTo(16.001f, 16.001f, 0f, false, false, 0f, 107.09f)
                verticalLineTo(144f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(480f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-36.91f)
                curveToRelative(0f, -6.67f, -4.14f, -12.64f, -10.38f, -14.98f)
                close()
                moveTo(64f, 192f)
                verticalLineToRelative(160f)
                horizontalLineTo(48f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(448f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-16f)
                verticalLineTo(192f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-96f)
                verticalLineTo(192f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-96f)
                verticalLineTo(192f)
                horizontalLineTo(64f)
                close()
                moveToRelative(432f, 256f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(480f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _Landmark!!
    }

private var _Landmark: ImageVector? = null

