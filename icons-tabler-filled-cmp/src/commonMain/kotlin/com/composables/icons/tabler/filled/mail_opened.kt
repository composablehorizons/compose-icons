package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.MailOpened: ImageVector
    get() {
        if (_MailOpened != null) return _MailOpened!!
        
        _MailOpened = ImageVector.Builder(
            name = "mail-opened",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.872f, 14.287f)
                lineToRelative(6.522f, 6.52f)
                arcToRelative(2.996f, 2.996f, 0f, false, true, -2.218f, 1.188f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-14f)
                arcToRelative(2.995f, 2.995f, 0f, false, true, -2.394f, -1.191f)
                lineToRelative(6.521f, -6.522f)
                lineToRelative(2.318f, 1.545f)
                lineToRelative(0.116f, 0.066f)
                arcToRelative(1f, 1f, 0f, false, false, 0.878f, 0f)
                lineToRelative(0.116f, -0.066f)
                lineToRelative(2.317f, -1.545f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 9.535f)
                lineToRelative(5.429f, 3.62f)
                lineToRelative(-5.429f, 5.43f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 9.535f)
                verticalLineToRelative(9.05f)
                lineToRelative(-5.43f, -5.43f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.44f, 2.102f)
                lineToRelative(0.115f, 0.066f)
                lineToRelative(8.444f, 5.629f)
                lineToRelative(-8.999f, 6f)
                lineToRelative(-9f, -6f)
                lineToRelative(8.445f, -5.63f)
                arcToRelative(1f, 1f, 0f, false, true, 0.994f, -0.065f)
                close()
            }
        }.build()
        
        return _MailOpened!!
    }

private var _MailOpened: ImageVector? = null

