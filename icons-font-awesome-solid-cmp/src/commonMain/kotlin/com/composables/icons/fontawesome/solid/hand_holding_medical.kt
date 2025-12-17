package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandHoldingMedical: ImageVector
    get() {
        if (_HandHoldingMedical != null) return _HandHoldingMedical!!
        
        _HandHoldingMedical = ImageVector.Builder(
            name = "hand-holding-medical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(159.88f, 175.82f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-64f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-64f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-64f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(64f)
                arcTo(16f, 16f, 0f, false, false, 159.88f, 175.82f)
                close()
                moveTo(568.07f, 336.13f)
                arcToRelative(39.91f, 39.91f, 0f, false, false, -55.93f, -8.47f)
                lineTo(392.47f, 415.84f)
                horizontalLineTo(271.86f)
                arcToRelative(16f, 16f, 0f, false, true, 0f, -32f)
                horizontalLineTo(350.1f)
                curveToRelative(16f, 0f, 30.75f, -10.87f, 33.37f, -26.61f)
                arcToRelative(32.06f, 32.06f, 0f, false, false, -31.62f, -37.38f)
                horizontalLineToRelative(-160f)
                arcToRelative(117.7f, 117.7f, 0f, false, false, -74.12f, 26.25f)
                lineToRelative(-46.5f, 37.74f)
                horizontalLineTo(15.87f)
                arcToRelative(16.11f, 16.11f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(96f)
                arcToRelative(16.11f, 16.11f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(347f)
                arcToRelative(104.8f, 104.8f, 0f, false, false, 61.7f, -20.27f)
                lineTo(559.6f, 392f)
                arcTo(40f, 40f, 0f, false, false, 568.07f, 336.13f)
                close()
            }
        }.build()
        
        return _HandHoldingMedical!!
    }

private var _HandHoldingMedical: ImageVector? = null

