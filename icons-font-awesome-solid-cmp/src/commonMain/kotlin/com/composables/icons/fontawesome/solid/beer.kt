package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Beer: ImageVector
    get() {
        if (_Beer != null) return _Beer!!
        
        _Beer = ImageVector.Builder(
            name = "beer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 96f)
                horizontalLineToRelative(-48f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(24f)
                curveTo(10.745f, 32f, 0f, 42.745f, 0f, 56f)
                verticalLineToRelative(400f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(272f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-42.11f)
                lineToRelative(80.606f, -35.977f)
                curveTo(429.396f, 365.063f, 448f, 336.388f, 448f, 304.86f)
                verticalLineTo(176f)
                curveToRelative(0f, -44.112f, -35.888f, -80f, -80f, -80f)
                close()
                moveToRelative(16f, 208.86f)
                arcToRelative(16.018f, 16.018f, 0f, false, true, -9.479f, 14.611f)
                lineTo(320f, 343.805f)
                verticalLineTo(160f)
                horizontalLineToRelative(48f)
                curveToRelative(8.822f, 0f, 16f, 7.178f, 16f, 16f)
                verticalLineToRelative(128.86f)
                close()
                moveTo(208f, 384f)
                curveToRelative(-8.836f, 0f, -16f, -7.164f, -16f, -16f)
                verticalLineTo(144f)
                curveToRelative(0f, -8.836f, 7.164f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.164f, 16f, 16f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 8.836f, -7.164f, 16f, -16f, 16f)
                close()
                moveToRelative(-96f, 0f)
                curveToRelative(-8.836f, 0f, -16f, -7.164f, -16f, -16f)
                verticalLineTo(144f)
                curveToRelative(0f, -8.836f, 7.164f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.164f, 16f, 16f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 8.836f, -7.164f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _Beer!!
    }

private var _Beer: ImageVector? = null

