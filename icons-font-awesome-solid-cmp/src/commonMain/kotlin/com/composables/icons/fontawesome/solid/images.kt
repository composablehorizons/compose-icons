package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Images: ImageVector
    get() {
        if (_Images != null) return _Images!!
        
        _Images = ImageVector.Builder(
            name = "images",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 416f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(176f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(208f)
                curveToRelative(0f, 44.112f, 35.888f, 80f, 80f, 80f)
                horizontalLineToRelative(336f)
                close()
                moveToRelative(96f, -80f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineTo(144f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(384f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                close()
                moveTo(256f, 128f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.49f, -48f, -48f)
                reflectiveCurveToRelative(21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                close()
                moveToRelative(-96f, 144f)
                lineToRelative(55.515f, -55.515f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0f)
                lineTo(272f, 256f)
                lineToRelative(135.515f, -135.515f)
                curveToRelative(4.686f, -4.686f, 12.284f, -4.686f, 16.971f, 0f)
                lineTo(512f, 208f)
                verticalLineToRelative(112f)
                horizontalLineTo(160f)
                verticalLineToRelative(-48f)
                close()
            }
        }.build()
        
        return _Images!!
    }

private var _Images: ImageVector? = null

