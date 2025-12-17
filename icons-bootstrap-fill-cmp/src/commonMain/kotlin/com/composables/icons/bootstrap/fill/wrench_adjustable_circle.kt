package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.WrenchAdjustableCircle: ImageVector
    get() {
        if (_WrenchAdjustableCircle != null) return _WrenchAdjustableCircle!!
        
        _WrenchAdjustableCircle = ImageVector.Builder(
            name = "wrench-adjustable-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.705f, 8.139f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.288f, -0.376f)
                lineToRelative(-1.5f, 0.5f)
                lineToRelative(0.159f, 0.474f)
                lineToRelative(0.808f, -0.27f)
                lineToRelative(-0.595f, 0.894f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.287f, 0.376f)
                lineToRelative(0.808f, -0.27f)
                lineToRelative(-0.595f, 0.894f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.287f, 0.376f)
                lineToRelative(1.5f, -0.5f)
                lineToRelative(-0.159f, -0.474f)
                lineToRelative(-0.808f, 0.27f)
                lineToRelative(0.596f, -0.894f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.288f, -0.376f)
                lineToRelative(-0.808f, 0.27f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                moveToRelative(-6.202f, -4.751f)
                lineToRelative(1.988f, -1.657f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 7.537f, -4.623f)
                lineTo(7.497f, 6.5f)
                lineToRelative(1f, 2.5f)
                lineToRelative(1.333f, 3.11f)
                curveToRelative(-0.56f, 0.251f, -1.18f, 0.39f, -1.833f, 0.39f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.592f, -0.29f)
                lineTo(4.747f, 14.2f)
                arcToRelative(7.03f, 7.03f, 0f, false, true, -2.949f, -2.951f)
                moveTo(12.496f, 8f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -1.703f, 3.526f)
                lineTo(9.497f, 8.5f)
                lineToRelative(2.959f, -1.11f)
                quadToRelative(0.04f, 0.3f, 0.04f, 0.61f)
            }
        }.build()
        
        return _WrenchAdjustableCircle!!
    }

private var _WrenchAdjustableCircle: ImageVector? = null

