package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VestPatches: ImageVector
    get() {
        if (_VestPatches != null) return _VestPatches!!
        
        _VestPatches = ImageVector.Builder(
            name = "vest-patches",
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
                arcToRelative(23.982f, 23.982f, 0f, false, false, -13.312f, 4.031f)
                lineToRelative(-25f, 16.672f)
                arcToRelative(103.794f, 103.794f, 0f, false, true, -115.376f, 0f)
                lineToRelative(-25f, -16.672f)
                arcTo(23.982f, 23.982f, 0f, false, false, 128f, 0f)
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
                lineTo(150.188f, 66.561f)
                arcTo(151.579f, 151.579f, 0f, false, false, 224f, 86.234f)
                arcToRelative(151.565f, 151.565f, 0f, false, false, 73.811f, -19.668f)
                lineTo(224f, 288f)
                verticalLineTo(512f)
                horizontalLineTo(416f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(275.377f)
                arcTo(64f, 64f, 0f, false, false, 437.252f, 239.877f)
                close()
                moveTo(63.5f, 272.484f)
                arcToRelative(12.01f, 12.01f, 0f, false, true, 17f, -16.968f)
                lineToRelative(15.5f, 15.5f)
                lineToRelative(15.5f, -15.5f)
                arcToRelative(12.01f, 12.01f, 0f, false, true, 17f, 16.968f)
                lineTo(112.984f, 288f)
                lineTo(128.5f, 303.516f)
                arcToRelative(12.01f, 12.01f, 0f, false, true, -17f, 16.968f)
                lineTo(96f, 304.984f)
                lineToRelative(-15.5f, 15.5f)
                arcToRelative(12.01f, 12.01f, 0f, false, true, -17f, -16.968f)
                lineTo(79.016f, 288f)
                close()
                moveTo(96f, 456f)
                arcToRelative(40f, 40f, 0f, true, true, 40f, -40f)
                arcTo(40f, 40f, 0f, false, true, 96f, 456f)
                close()
                moveTo(359.227f, 335.785f)
                lineTo(310.7f, 336f)
                arcToRelative(6.671f, 6.671f, 0f, false, true, -6.7f, -6.7f)
                lineToRelative(0.215f, -48.574f)
                arcTo(24.987f, 24.987f, 0f, false, true, 331.43f, 256.1f)
                curveToRelative(12.789f, 1.162f, 22.129f, 12.619f, 22.056f, 25.419f)
                lineToRelative(-0.037f, 5.057f)
                lineToRelative(5.051f, -0.037f)
                curveToRelative(12.826f, -0.035f, 24.236f, 9.275f, 25.4f, 22.076f)
                arcTo(24.948f, 24.948f, 0f, false, true, 359.227f, 335.785f)
                close()
            }
        }.build()
        
        return _VestPatches!!
    }

private var _VestPatches: ImageVector? = null

