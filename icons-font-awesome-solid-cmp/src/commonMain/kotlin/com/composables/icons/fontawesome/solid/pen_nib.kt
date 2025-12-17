package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PenNib: ImageVector
    get() {
        if (_PenNib != null) return _PenNib!!
        
        _PenNib = ImageVector.Builder(
            name = "pen-nib",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136.6f, 138.79f)
                arcToRelative(64.003f, 64.003f, 0f, false, false, -43.31f, 41.35f)
                lineTo(0f, 460f)
                lineToRelative(14.69f, 14.69f)
                lineTo(164.8f, 324.58f)
                curveToRelative(-2.99f, -6.26f, -4.8f, -13.18f, -4.8f, -20.58f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.49f, 48f, 48f)
                reflectiveCurveToRelative(-21.49f, 48f, -48f, 48f)
                curveToRelative(-7.4f, 0f, -14.32f, -1.81f, -20.58f, -4.8f)
                lineTo(37.31f, 497.31f)
                lineTo(52f, 512f)
                lineToRelative(279.86f, -93.29f)
                arcToRelative(64.003f, 64.003f, 0f, false, false, 41.35f, -43.31f)
                lineTo(416f, 224f)
                lineTo(288f, 96f)
                lineToRelative(-151.4f, 42.79f)
                close()
                moveToRelative(361.34f, -64.62f)
                lineToRelative(-60.11f, -60.11f)
                curveToRelative(-18.75f, -18.75f, -49.16f, -18.75f, -67.91f, 0f)
                lineToRelative(-56.55f, 56.55f)
                lineToRelative(128.02f, 128.02f)
                lineToRelative(56.55f, -56.55f)
                curveToRelative(18.75f, -18.75f, 18.75f, -49.15f, 0f, -67.91f)
                close()
            }
        }.build()
        
        return _PenNib!!
    }

private var _PenNib: ImageVector? = null

