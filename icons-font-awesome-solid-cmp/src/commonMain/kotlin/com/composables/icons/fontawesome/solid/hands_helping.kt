package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandsHelping: ImageVector
    get() {
        if (_HandsHelping != null) return _HandsHelping!!
        
        _HandsHelping = ImageVector.Builder(
            name = "hands-helping",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(488f, 192f)
                horizontalLineTo(336f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 39.7f, -32.3f, 72f, -72f, 72f)
                reflectiveCurveToRelative(-72f, -32.3f, -72f, -72f)
                verticalLineTo(126.4f)
                lineToRelative(-64.9f, 39f)
                curveTo(107.8f, 176.9f, 96f, 197.8f, 96f, 220.2f)
                verticalLineToRelative(47.3f)
                lineToRelative(-80f, 46.2f)
                curveTo(0.7f, 322.5f, -4.6f, 342.1f, 4.3f, 357.4f)
                lineToRelative(80f, 138.6f)
                curveToRelative(8.8f, 15.3f, 28.4f, 20.5f, 43.7f, 11.7f)
                lineTo(231.4f, 448f)
                horizontalLineTo(368f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                horizontalLineToRelative(16f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(8f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                close()
                moveToRelative(147.7f, -37.4f)
                lineTo(555.7f, 16f)
                curveTo(546.9f, 0.7f, 527.3f, -4.5f, 512f, 4.3f)
                lineTo(408.6f, 64f)
                horizontalLineTo(306.4f)
                curveToRelative(-12f, 0f, -23.7f, 3.4f, -33.9f, 9.7f)
                lineTo(239f, 94.6f)
                curveToRelative(-9.4f, 5.8f, -15f, 16.1f, -15f, 27.1f)
                verticalLineTo(248f)
                curveToRelative(0f, 22.1f, 17.9f, 40f, 40f, 40f)
                reflectiveCurveToRelative(40f, -17.9f, 40f, -40f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(184f)
                curveToRelative(30.9f, 0f, 56f, 25.1f, 56f, 56f)
                verticalLineToRelative(28.5f)
                lineToRelative(80f, -46.2f)
                curveToRelative(15.3f, -8.9f, 20.5f, -28.4f, 11.7f, -43.7f)
                close()
            }
        }.build()
        
        return _HandsHelping!!
    }

private var _HandsHelping: ImageVector? = null

