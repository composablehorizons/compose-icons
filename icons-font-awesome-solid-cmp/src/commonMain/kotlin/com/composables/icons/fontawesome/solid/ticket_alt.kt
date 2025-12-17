package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.TicketAlt: ImageVector
    get() {
        if (_TicketAlt != null) return _TicketAlt!!
        
        _TicketAlt = ImageVector.Builder(
            name = "ticket-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(192f)
                horizontalLineTo(128f)
                verticalLineTo(160f)
                close()
                moveToRelative(400f, 96f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineToRelative(-96f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                reflectiveCurveToRelative(-21.49f, -48f, -48f, -48f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(96f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                close()
                moveToRelative(-48f, -104f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(120f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(208f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(336f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(152f)
                close()
            }
        }.build()
        
        return _TicketAlt!!
    }

private var _TicketAlt: ImageVector? = null

