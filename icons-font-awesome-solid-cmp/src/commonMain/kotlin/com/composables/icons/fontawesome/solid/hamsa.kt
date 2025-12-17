package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hamsa: ImageVector
    get() {
        if (_Hamsa != null) return _Hamsa!!
        
        _Hamsa = ImageVector.Builder(
            name = "hamsa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(509.34f, 307.25f)
                curveTo(504.28f, 295.56f, 492.75f, 288f, 480f, 288f)
                horizontalLineToRelative(-64f)
                verticalLineTo(80f)
                curveToRelative(0f, -22f, -18f, -40f, -40f, -40f)
                reflectiveCurveToRelative(-40f, 18f, -40f, 40f)
                verticalLineToRelative(134f)
                curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                horizontalLineToRelative(-20f)
                curveToRelative(-5.52f, 0f, -10f, -4.48f, -10f, -10f)
                verticalLineTo(40f)
                curveToRelative(0f, -22f, -18f, -40f, -40f, -40f)
                reflectiveCurveToRelative(-40f, 18f, -40f, 40f)
                verticalLineToRelative(174f)
                curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                horizontalLineToRelative(-20f)
                curveToRelative(-5.52f, 0f, -10f, -4.48f, -10f, -10f)
                verticalLineTo(80f)
                curveToRelative(0f, -22f, -18f, -40f, -40f, -40f)
                reflectiveCurveTo(96f, 58f, 96f, 80f)
                verticalLineToRelative(208f)
                horizontalLineTo(32f)
                curveToRelative(-12.75f, 0f, -24.28f, 7.56f, -29.34f, 19.25f)
                arcToRelative(31.966f, 31.966f, 0f, false, false, 5.94f, 34.58f)
                lineToRelative(102.69f, 110.03f)
                curveTo(146.97f, 490.08f, 199.69f, 512f, 256f, 512f)
                reflectiveCurveToRelative(109.03f, -21.92f, 144.72f, -60.14f)
                lineTo(503.4f, 341.83f)
                arcToRelative(31.966f, 31.966f, 0f, false, false, 5.94f, -34.58f)
                close()
                moveTo(256f, 416f)
                curveToRelative(-53.02f, 0f, -96f, -64f, -96f, -64f)
                reflectiveCurveToRelative(42.98f, -64f, 96f, -64f)
                reflectiveCurveToRelative(96f, 64f, 96f, 64f)
                reflectiveCurveToRelative(-42.98f, 64f, -96f, 64f)
                close()
                moveToRelative(0f, -96f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
                reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Hamsa!!
    }

private var _Hamsa: ImageVector? = null

