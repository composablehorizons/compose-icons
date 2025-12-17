package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Taxi: ImageVector
    get() {
        if (_Taxi != null) return _Taxi!!
        
        _Taxi = ImageVector.Builder(
            name = "taxi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(462f, 241.64f)
                lineToRelative(-22f, -84.84f)
                curveToRelative(-9.6f, -35.2f, -41.6f, -60.8f, -76.8f, -60.8f)
                horizontalLineTo(352f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(192f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-11.2f)
                curveToRelative(-35.2f, 0f, -67.2f, 25.6f, -76.8f, 60.8f)
                lineToRelative(-22f, 84.84f)
                curveTo(21.41f, 248.04f, 0f, 273.47f, 0f, 304f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 23.63f, 12.95f, 44.04f, 32f, 55.12f)
                verticalLineTo(448f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-40.88f)
                curveToRelative(19.05f, -11.09f, 32f, -31.5f, 32f, -55.12f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -30.53f, -21.41f, -55.96f, -50f, -62.36f)
                close()
                moveTo(96f, 352f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
                moveToRelative(20.55f, -112f)
                lineToRelative(17.2f, -66.36f)
                curveToRelative(2.23f, -8.16f, 9.59f, -13.64f, 15.06f, -13.64f)
                horizontalLineToRelative(214.4f)
                curveToRelative(5.47f, 0f, 12.83f, 5.48f, 14.85f, 12.86f)
                lineTo(395.45f, 240f)
                horizontalLineToRelative(-278.9f)
                close()
                moveTo(416f, 352f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _Taxi!!
    }

private var _Taxi: ImageVector? = null

