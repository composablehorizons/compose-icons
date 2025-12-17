package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Medkit: ImageVector
    get() {
        if (_Medkit != null) return _Medkit!!
        
        _Medkit = ImageVector.Builder(
            name = "medkit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 480f)
                horizontalLineToRelative(320f)
                verticalLineTo(128f)
                horizontalLineToRelative(-32f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineTo(176f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(48f)
                horizontalLineTo(96f)
                verticalLineToRelative(352f)
                close()
                moveToRelative(96f, -384f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(32f)
                horizontalLineTo(192f)
                verticalLineTo(96f)
                close()
                moveToRelative(320f, 80f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineToRelative(-16f)
                verticalLineTo(128f)
                horizontalLineToRelative(16f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                close()
                moveTo(64f, 480f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(352f)
                close()
                moveToRelative(288f, -208f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.837f, -7.163f, 16f, -16f, 16f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.837f, -7.163f, 16f, -16f, 16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.837f, 0f, -16f, -7.163f, -16f, -16f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(-48f)
                curveToRelative(-8.837f, 0f, -16f, -7.163f, -16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.837f, 7.163f, -16f, 16f, -16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -8.837f, 7.163f, -16f, 16f, -16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.837f, 0f, 16f, 7.163f, 16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(48f)
                curveToRelative(8.837f, 0f, 16f, 7.163f, 16f, 16f)
                close()
            }
        }.build()
        
        return _Medkit!!
    }

private var _Medkit: ImageVector? = null

