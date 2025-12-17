package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandLizard: ImageVector
    get() {
        if (_HandLizard != null) return _HandLizard!!
        
        _HandLizard = ImageVector.Builder(
            name = "hand-lizard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 480f)
                horizontalLineToRelative(192f)
                verticalLineTo(363.778f)
                arcToRelative(95.998f, 95.998f, 0f, false, false, -14.833f, -51.263f)
                lineTo(398.127f, 54.368f)
                arcTo(48f, 48f, 0f, false, false, 357.544f, 32f)
                horizontalLineTo(24f)
                curveTo(10.745f, 32f, 0f, 42.745f, 0f, 56f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 30.928f, 25.072f, 56f, 56f, 56f)
                horizontalLineToRelative(229.981f)
                curveToRelative(12.844f, 0f, 21.556f, 13.067f, 16.615f, 24.923f)
                lineToRelative(-21.41f, 51.385f)
                arcTo(32f, 32f, 0f, false, true, 251.648f, 224f)
                horizontalLineTo(128f)
                curveToRelative(-35.346f, 0f, -64f, 28.654f, -64f, 64f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(147.406f)
                arcToRelative(47.995f, 47.995f, 0f, false, true, 25.692f, 7.455f)
                lineToRelative(111.748f, 70.811f)
                arcTo(24.001f, 24.001f, 0f, false, true, 384f, 418.539f)
                verticalLineTo(480f)
                close()
            }
        }.build()
        
        return _HandLizard!!
    }

private var _HandLizard: ImageVector? = null

