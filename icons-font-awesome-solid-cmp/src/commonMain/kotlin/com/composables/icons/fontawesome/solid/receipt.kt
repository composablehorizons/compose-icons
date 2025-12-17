package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Receipt: ImageVector
    get() {
        if (_Receipt != null) return _Receipt!!
        
        _Receipt = ImageVector.Builder(
            name = "receipt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(358.4f, 3.2f)
                lineTo(320f, 48f)
                lineTo(265.6f, 3.2f)
                arcToRelative(15.9f, 15.9f, 0f, false, false, -19.2f, 0f)
                lineTo(192f, 48f)
                lineTo(137.6f, 3.2f)
                arcToRelative(15.9f, 15.9f, 0f, false, false, -19.2f, 0f)
                lineTo(64f, 48f)
                lineTo(25.6f, 3.2f)
                curveTo(15f, -4.7f, 0f, 2.8f, 0f, 16f)
                verticalLineToRelative(480f)
                curveToRelative(0f, 13.2f, 15f, 20.7f, 25.6f, 12.8f)
                lineTo(64f, 464f)
                lineToRelative(54.4f, 44.8f)
                arcToRelative(15.9f, 15.9f, 0f, false, false, 19.2f, 0f)
                lineTo(192f, 464f)
                lineToRelative(54.4f, 44.8f)
                arcToRelative(15.9f, 15.9f, 0f, false, false, 19.2f, 0f)
                lineTo(320f, 464f)
                lineToRelative(38.4f, 44.8f)
                curveToRelative(10.5f, 7.9f, 25.6f, 0.4f, 25.6f, -12.8f)
                verticalLineTo(16f)
                curveToRelative(0f, -13.2f, -15f, -20.7f, -25.6f, -12.8f)
                close()
                moveTo(320f, 360f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(72f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(240f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(72f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(240f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(72f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(240f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Receipt!!
    }

private var _Receipt: ImageVector? = null

