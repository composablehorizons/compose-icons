package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SimCard: ImageVector
    get() {
        if (_SimCard != null) return _SimCard!!
        
        _SimCard = ImageVector.Builder(
            name = "sim-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 64f)
                verticalLineToRelative(384f)
                curveToRelative(0f, 35.3f, 28.7f, 64f, 64f, 64f)
                horizontalLineToRelative(256f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                verticalLineTo(128f)
                lineTo(256f, 0f)
                horizontalLineTo(64f)
                curveTo(28.7f, 0f, 0f, 28.7f, 0f, 64f)
                close()
                moveToRelative(224f, 192f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(96f, 0f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(32f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(-64f, 128f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.7f, -14.3f, 32f, -32f, 32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-64f)
                close()
                moveToRelative(-96f, 0f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                close()
                moveToRelative(-96f, 0f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                horizontalLineTo(96f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                verticalLineToRelative(-32f)
                close()
                moveToRelative(0f, -96f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(64f)
                horizontalLineTo(64f)
                verticalLineToRelative(-64f)
                close()
                moveToRelative(0f, -64f)
                curveToRelative(0f, -17.7f, 14.3f, -32f, 32f, -32f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(64f)
                horizontalLineTo(64f)
                verticalLineToRelative(-32f)
                close()
            }
        }.build()
        
        return _SimCard!!
    }

private var _SimCard: ImageVector? = null

