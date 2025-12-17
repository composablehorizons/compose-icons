package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VoteYea: ImageVector
    get() {
        if (_VoteYea != null) return _VoteYea!!
        
        _VoteYea = ImageVector.Builder(
            name = "vote-yea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(608f, 320f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(22.4f)
                curveToRelative(5.3f, 0f, 9.6f, 3.6f, 9.6f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -4.3f, 8f, -9.6f, 8f)
                horizontalLineTo(73.6f)
                curveToRelative(-5.3f, 0f, -9.6f, -3.6f, -9.6f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 4.3f, -8f, 9.6f, -8f)
                horizontalLineTo(96f)
                verticalLineToRelative(-64f)
                horizontalLineTo(32f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(576f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                close()
                moveToRelative(-96f, 64f)
                verticalLineTo(64.3f)
                curveToRelative(0f, -17.9f, -14.5f, -32.3f, -32.3f, -32.3f)
                horizontalLineTo(160.4f)
                curveTo(142.5f, 32f, 128f, 46.5f, 128f, 64.3f)
                verticalLineTo(384f)
                horizontalLineToRelative(384f)
                close()
                moveTo(211.2f, 202f)
                lineToRelative(25.5f, -25.3f)
                curveToRelative(4.2f, -4.2f, 11f, -4.2f, 15.2f, 0.1f)
                lineToRelative(41.3f, 41.6f)
                lineToRelative(95.2f, -94.4f)
                curveToRelative(4.2f, -4.2f, 11f, -4.2f, 15.2f, 0.1f)
                lineToRelative(25.3f, 25.5f)
                curveToRelative(4.2f, 4.2f, 4.2f, 11f, -0.1f, 15.2f)
                lineTo(300.5f, 292f)
                curveToRelative(-4.2f, 4.2f, -11f, 4.2f, -15.2f, -0.1f)
                lineToRelative(-74.1f, -74.7f)
                curveToRelative(-4.3f, -4.2f, -4.2f, -11f, 0f, -15.2f)
                close()
            }
        }.build()
        
        return _VoteYea!!
    }

private var _VoteYea: ImageVector? = null

