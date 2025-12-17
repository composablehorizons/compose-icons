package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Blender: ImageVector
    get() {
        if (_Blender != null) return _Blender!!
        
        _Blender = ImageVector.Builder(
            name = "blender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 384f)
                horizontalLineTo(160f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(320f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                close()
                moveToRelative(-128f, 96f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(40f, -416f)
                horizontalLineToRelative(166.54f)
                lineTo(512f, 0f)
                horizontalLineTo(48f)
                curveTo(21.49f, 0f, 0f, 21.49f, 0f, 48f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(103.27f)
                lineToRelative(8.73f, 96f)
                horizontalLineToRelative(256f)
                lineToRelative(17.46f, -64f)
                horizontalLineTo(328f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(114.18f)
                lineToRelative(17.46f, -64f)
                horizontalLineTo(328f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(140.36f)
                lineToRelative(17.46f, -64f)
                horizontalLineTo(328f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineTo(72f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                close()
                moveTo(64f, 192f)
                verticalLineTo(64f)
                horizontalLineToRelative(69.82f)
                lineToRelative(11.64f, 128f)
                horizontalLineTo(64f)
                close()
            }
        }.build()
        
        return _Blender!!
    }

private var _Blender: ImageVector? = null

