package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FighterJet: ImageVector
    get() {
        if (_FighterJet != null) return _FighterJet!!
        
        _FighterJet = ImageVector.Builder(
            name = "fighter-jet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(544f, 224f)
                lineToRelative(-128f, -16f)
                lineToRelative(-48f, -16f)
                horizontalLineToRelative(-24f)
                lineTo(227.158f, 44f)
                horizontalLineToRelative(39.509f)
                curveTo(278.333f, 44f, 288f, 41.375f, 288f, 38f)
                reflectiveCurveToRelative(-9.667f, -6f, -21.333f, -6f)
                horizontalLineTo(152f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(164f)
                horizontalLineToRelative(-48f)
                lineToRelative(-66.667f, -80f)
                horizontalLineTo(18.667f)
                lineTo(8f, 138.667f)
                verticalLineTo(208f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(2.666f)
                lineToRelative(-64f, 8f)
                verticalLineToRelative(42.667f)
                lineToRelative(64f, 8f)
                verticalLineTo(288f)
                horizontalLineTo(16f)
                verticalLineToRelative(16f)
                horizontalLineTo(8f)
                verticalLineToRelative(69.333f)
                lineTo(18.667f, 384f)
                horizontalLineToRelative(34.667f)
                lineTo(120f, 304f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(164f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(114.667f)
                curveToRelative(11.667f, 0f, 21.333f, -2.625f, 21.333f, -6f)
                reflectiveCurveToRelative(-9.667f, -6f, -21.333f, -6f)
                horizontalLineToRelative(-39.509f)
                lineTo(344f, 320f)
                horizontalLineToRelative(24f)
                lineToRelative(48f, -16f)
                lineToRelative(128f, -16f)
                curveToRelative(96f, -21.333f, 96f, -26.583f, 96f, -32f)
                curveToRelative(0f, -5.417f, 0f, -10.667f, -96f, -32f)
                close()
            }
        }.build()
        
        return _FighterJet!!
    }

private var _FighterJet: ImageVector? = null

