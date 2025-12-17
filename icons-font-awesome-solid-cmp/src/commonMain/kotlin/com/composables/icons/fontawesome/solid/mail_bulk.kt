package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MailBulk: ImageVector
    get() {
        if (_MailBulk != null) return _MailBulk!!
        
        _MailBulk = ImageVector.Builder(
            name = "mail-bulk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 448f)
                curveToRelative(-25.6f, 0f, -51.2f, -22.4f, -64f, -32f)
                curveToRelative(-64f, -44.8f, -83.2f, -60.8f, -96f, -70.4f)
                verticalLineTo(480f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(256f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(345.6f)
                curveToRelative(-12.8f, 9.6f, -32f, 25.6f, -96f, 70.4f)
                curveToRelative(-12.8f, 9.6f, -38.4f, 32f, -64f, 32f)
                close()
                moveToRelative(128f, -192f)
                horizontalLineTo(32f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(16f)
                curveToRelative(25.6f, 19.2f, 22.4f, 19.2f, 115.2f, 86.4f)
                curveToRelative(9.6f, 6.4f, 28.8f, 25.6f, 44.8f, 25.6f)
                reflectiveCurveToRelative(35.2f, -19.2f, 44.8f, -22.4f)
                curveToRelative(92.8f, -67.2f, 89.6f, -67.2f, 115.2f, -86.4f)
                verticalLineTo(288f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(256f, -96f)
                horizontalLineTo(224f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(96f)
                curveToRelative(33.21f, 0f, 60.59f, 25.42f, 63.71f, 57.82f)
                lineToRelative(0.29f, -0.22f)
                verticalLineTo(416f)
                horizontalLineToRelative(192f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(192f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveToRelative(-32f, 128f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                close()
                moveToRelative(-352f, -96f)
                curveToRelative(0f, -35.29f, 28.71f, -64f, 64f, -64f)
                horizontalLineToRelative(224f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(96f)
                curveTo(78.33f, 0f, 64f, 14.33f, 64f, 32f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(-32f)
                close()
            }
        }.build()
        
        return _MailBulk!!
    }

private var _MailBulk: ImageVector? = null

