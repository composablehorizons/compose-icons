package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bus: ImageVector
    get() {
        if (_Bus != null) return _Bus!!
        
        _Bus = ImageVector.Builder(
            name = "bus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(488f, 128f)
                horizontalLineToRelative(-8f)
                verticalLineTo(80f)
                curveToRelative(0f, -44.8f, -99.2f, -80f, -224f, -80f)
                reflectiveCurveTo(32f, 35.2f, 32f, 80f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-8f)
                curveToRelative(-13.25f, 0f, -24f, 10.74f, -24f, 24f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 13.25f, 10.75f, 24f, 24f, 24f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(6.4f)
                curveToRelative(16f, 0f, 25.6f, -12.8f, 25.6f, -25.6f)
                verticalLineTo(256f)
                horizontalLineToRelative(8f)
                curveToRelative(13.25f, 0f, 24f, -10.75f, 24f, -24f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -13.26f, -10.75f, -24f, -24f, -24f)
                close()
                moveTo(112f, 400f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(16f, -112f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                verticalLineTo(128f)
                curveToRelative(0f, -17.67f, 14.33f, -32f, 32f, -32f)
                horizontalLineToRelative(256f)
                curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
                horizontalLineTo(128f)
                close()
                moveToRelative(272f, 112f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _Bus!!
    }

private var _Bus: ImageVector? = null

