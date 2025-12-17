package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Vest: ImageVector
    get() {
        if (_Vest != null) return _Vest!!
        
        _Vest = ImageVector.Builder(
            name = "vest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(437.252f, 239.877f)
                lineTo(384f, 160f)
                verticalLineTo(32f)
                arcTo(32f, 32f, 0f, false, false, 352f, 0f)
                horizontalLineTo(320f)
                arcToRelative(24.021f, 24.021f, 0f, false, false, -13.312f, 4.031f)
                lineToRelative(-25f, 16.672f)
                arcToRelative(103.794f, 103.794f, 0f, false, true, -115.376f, 0f)
                lineToRelative(-25f, -16.672f)
                arcTo(24.021f, 24.021f, 0f, false, false, 128f, 0f)
                horizontalLineTo(96f)
                arcTo(32f, 32f, 0f, false, false, 64f, 32f)
                verticalLineTo(160f)
                lineTo(10.748f, 239.877f)
                arcTo(64f, 64f, 0f, false, false, 0f, 275.377f)
                verticalLineTo(480f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineTo(192f)
                verticalLineTo(288f)
                arcToRelative(31.987f, 31.987f, 0f, false, true, 1.643f, -10.119f)
                lineTo(207.135f, 237.4f)
                lineTo(150.188f, 66.564f)
                arcTo(151.518f, 151.518f, 0f, false, false, 224f, 86.234f)
                arcToRelative(151.55f, 151.55f, 0f, false, false, 73.812f, -19.672f)
                lineTo(224f, 288f)
                verticalLineTo(512f)
                horizontalLineTo(416f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(275.377f)
                arcTo(64f, 64f, 0f, false, false, 437.252f, 239.877f)
                close()
                moveTo(131.312f, 371.312f)
                lineToRelative(-48f, 48f)
                arcToRelative(16f, 16f, 0f, false, true, -22.624f, -22.624f)
                lineToRelative(48f, -48f)
                arcToRelative(16f, 16f, 0f, false, true, 22.624f, 22.624f)
                close()
                moveToRelative(256f, 48f)
                arcToRelative(15.992f, 15.992f, 0f, false, true, -22.624f, 0f)
                lineToRelative(-48f, -48f)
                arcToRelative(16f, 16f, 0f, false, true, 22.624f, -22.624f)
                lineToRelative(48f, 48f)
                arcTo(15.993f, 15.993f, 0f, false, true, 387.312f, 419.312f)
                close()
            }
        }.build()
        
        return _Vest!!
    }

private var _Vest: ImageVector? = null

