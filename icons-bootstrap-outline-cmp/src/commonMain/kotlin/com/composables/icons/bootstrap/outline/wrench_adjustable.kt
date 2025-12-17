package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.WrenchAdjustable: ImageVector
    get() {
        if (_WrenchAdjustable != null) return _WrenchAdjustable!!
        
        _WrenchAdjustable = ImageVector.Builder(
            name = "wrench-adjustable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.703f, 3.526f)
                lineTo(13f, 5f)
                lineToRelative(2.959f, -1.11f)
                quadToRelative(0.04f, 0.3f, 0.041f, 0.61f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 9f)
                curveToRelative(0.653f, 0f, 1.273f, -0.139f, 1.833f, -0.39f)
                lineTo(12f, 5.5f)
                lineTo(11f, 3f)
                lineToRelative(3.826f, -1.53f)
                arcTo(4.5f, 4.5f, 0f, false, false, 7.29f, 6.092f)
                lineToRelative(-6.116f, 5.096f)
                arcToRelative(2.583f, 2.583f, 0f, true, false, 3.638f, 3.638f)
                lineTo(9.908f, 8.71f)
                arcTo(4.5f, 4.5f, 0f, false, false, 11.5f, 9f)
                moveToRelative(-1.292f, -4.361f)
                lineToRelative(-0.596f, 0.893f)
                lineToRelative(0.809f, -0.27f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.287f, 0.377f)
                lineToRelative(-0.596f, 0.893f)
                lineToRelative(0.809f, -0.27f)
                lineToRelative(0.158f, 0.475f)
                lineToRelative(-1.5f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.287f, -0.376f)
                lineToRelative(0.596f, -0.893f)
                lineToRelative(-0.809f, 0.27f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.287f, -0.377f)
                lineToRelative(0.596f, -0.893f)
                lineToRelative(-0.809f, 0.27f)
                lineToRelative(-0.158f, -0.475f)
                lineToRelative(1.5f, -0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.287f, 0.376f)
                moveTo(3f, 14f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
            }
        }.build()
        
        return _WrenchAdjustable!!
    }

private var _WrenchAdjustable: ImageVector? = null

