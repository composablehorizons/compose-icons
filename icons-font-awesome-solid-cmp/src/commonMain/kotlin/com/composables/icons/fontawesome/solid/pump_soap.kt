package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PumpSoap: ImageVector
    get() {
        if (_PumpSoap != null) return _PumpSoap!!
        
        _PumpSoap = ImageVector.Builder(
            name = "pump-soap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(235.63f, 160f)
                horizontalLineTo(84.37f)
                arcToRelative(64f, 64f, 0f, false, false, -63.74f, 58.21f)
                lineTo(0.27f, 442.21f)
                arcTo(64f, 64f, 0f, false, false, 64f, 512f)
                horizontalLineTo(256f)
                arcToRelative(64f, 64f, 0f, false, false, 63.74f, -69.79f)
                lineToRelative(-20.36f, -224f)
                arcTo(64f, 64f, 0f, false, false, 235.63f, 160f)
                close()
                moveTo(160f, 416f)
                curveToRelative(-33.12f, 0f, -60f, -26.33f, -60f, -58.75f)
                curveToRelative(0f, -25f, 35.7f, -75.47f, 52f, -97.27f)
                arcTo(10f, 10f, 0f, false, true, 168f, 260f)
                curveToRelative(16.33f, 21.8f, 52f, 72.27f, 52f, 97.27f)
                curveTo(220f, 389.67f, 193.12f, 416f, 160f, 416f)
                close()
                moveTo(379.31f, 94.06f)
                lineTo(336f, 50.74f)
                arcTo(64f, 64f, 0f, false, false, 290.75f, 32f)
                horizontalLineTo(224f)
                arcTo(32f, 32f, 0f, false, false, 192f, 0f)
                horizontalLineTo(128f)
                arcTo(32f, 32f, 0f, false, false, 96f, 32f)
                verticalLineToRelative(96f)
                horizontalLineTo(224f)
                verticalLineTo(96f)
                horizontalLineToRelative(66.75f)
                lineToRelative(43.31f, 43.31f)
                arcToRelative(16f, 16f, 0f, false, false, 22.63f, 0f)
                lineToRelative(22.62f, -22.62f)
                arcTo(16f, 16f, 0f, false, false, 379.31f, 94.06f)
                close()
            }
        }.build()
        
        return _PumpSoap!!
    }

private var _PumpSoap: ImageVector? = null

