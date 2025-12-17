package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Hash: ImageVector
    get() {
        if (_Hash != null) return _Hash!!
        
        _Hash = ImageVector.Builder(
            name = "hash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.39f, 12.648f)
                arcToRelative(1f, 1f, 0f, false, false, -0.015f, 0.18f)
                curveToRelative(0f, 0.305f, 0.21f, 0.508f, 0.5f, 0.508f)
                curveToRelative(0.266f, 0f, 0.492f, -0.172f, 0.555f, -0.477f)
                lineToRelative(0.554f, -2.703f)
                horizontalLineToRelative(1.204f)
                curveToRelative(0.421f, 0f, 0.617f, -0.234f, 0.617f, -0.547f)
                curveToRelative(0f, -0.312f, -0.188f, -0.53f, -0.617f, -0.53f)
                horizontalLineToRelative(-0.985f)
                lineToRelative(0.516f, -2.524f)
                horizontalLineToRelative(1.265f)
                curveToRelative(0.43f, 0f, 0.618f, -0.227f, 0.618f, -0.547f)
                curveToRelative(0f, -0.313f, -0.188f, -0.524f, -0.618f, -0.524f)
                horizontalLineToRelative(-1.046f)
                lineToRelative(0.476f, -2.304f)
                arcToRelative(1f, 1f, 0f, false, false, 0.016f, -0.164f)
                arcToRelative(0.51f, 0.51f, 0f, false, false, -0.516f, -0.516f)
                arcToRelative(0.54f, 0.54f, 0f, false, false, -0.539f, 0.43f)
                lineToRelative(-0.523f, 2.554f)
                horizontalLineTo(7.617f)
                lineToRelative(0.477f, -2.304f)
                curveToRelative(0.008f, -0.04f, 0.015f, -0.118f, 0.015f, -0.164f)
                arcToRelative(0.51f, 0.51f, 0f, false, false, -0.523f, -0.516f)
                arcToRelative(0.54f, 0.54f, 0f, false, false, -0.531f, 0.43f)
                lineTo(6.53f, 5.484f)
                horizontalLineTo(5.414f)
                curveToRelative(-0.43f, 0f, -0.617f, 0.22f, -0.617f, 0.532f)
                reflectiveCurveToRelative(0.187f, 0.539f, 0.617f, 0.539f)
                horizontalLineToRelative(0.906f)
                lineToRelative(-0.515f, 2.523f)
                horizontalLineTo(4.609f)
                curveToRelative(-0.421f, 0f, -0.609f, 0.219f, -0.609f, 0.531f)
                reflectiveCurveToRelative(0.188f, 0.547f, 0.61f, 0.547f)
                horizontalLineToRelative(0.976f)
                lineToRelative(-0.516f, 2.492f)
                curveToRelative(-0.008f, 0.04f, -0.015f, 0.125f, -0.015f, 0.18f)
                curveToRelative(0f, 0.305f, 0.21f, 0.508f, 0.5f, 0.508f)
                curveToRelative(0.265f, 0f, 0.492f, -0.172f, 0.554f, -0.477f)
                lineToRelative(0.555f, -2.703f)
                horizontalLineToRelative(2.242f)
                close()
                moveToRelative(-1f, -6.109f)
                horizontalLineToRelative(2.266f)
                lineToRelative(-0.515f, 2.563f)
                horizontalLineTo(6.859f)
                lineToRelative(0.532f, -2.563f)
                close()
            }
        }.build()
        
        return _Hash!!
    }

private var _Hash: ImageVector? = null

