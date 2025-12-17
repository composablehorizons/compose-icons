package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Warehouse: ImageVector
    get() {
        if (_Warehouse != null) return _Warehouse!!
        
        _Warehouse = ImageVector.Builder(
            name = "warehouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 352f)
                horizontalLineTo(136.4f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                lineToRelative(-0.1f, 48f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineTo(504f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                close()
                moveToRelative(0f, 96f)
                horizontalLineTo(136.1f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                lineToRelative(-0.1f, 48f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(368f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                close()
                moveToRelative(0f, -192f)
                horizontalLineTo(136.6f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                lineToRelative(-0.1f, 48f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineTo(504f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                close()
                moveToRelative(106.5f, -139f)
                lineTo(338.4f, 3.7f)
                arcToRelative(48.15f, 48.15f, 0f, false, false, -36.9f, 0f)
                lineTo(29.5f, 117f)
                curveTo(11.7f, 124.5f, 0f, 141.9f, 0f, 161.3f)
                verticalLineTo(504f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(80f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineTo(256f)
                curveToRelative(0f, -17.6f, 14.6f, -32f, 32.6f, -32f)
                horizontalLineToRelative(382.8f)
                curveToRelative(18f, 0f, 32.6f, 14.4f, 32.6f, 32f)
                verticalLineToRelative(248f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                horizontalLineToRelative(80f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineTo(161.3f)
                curveToRelative(0f, -19.4f, -11.7f, -36.8f, -29.5f, -44.3f)
                close()
            }
        }.build()
        
        return _Warehouse!!
    }

private var _Warehouse: ImageVector? = null

