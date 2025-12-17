package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ShareAltSquare: ImageVector
    get() {
        if (_ShareAltSquare != null) return _ShareAltSquare!!
        
        _ShareAltSquare = ImageVector.Builder(
            name = "share-alt-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                close()
                moveTo(304f, 296f)
                curveToRelative(-14.562f, 0f, -27.823f, 5.561f, -37.783f, 14.671f)
                lineToRelative(-67.958f, -40.775f)
                arcToRelative(56.339f, 56.339f, 0f, false, false, 0f, -27.793f)
                lineToRelative(67.958f, -40.775f)
                curveTo(276.177f, 210.439f, 289.438f, 216f, 304f, 216f)
                curveToRelative(30.928f, 0f, 56f, -25.072f, 56f, -56f)
                reflectiveCurveToRelative(-25.072f, -56f, -56f, -56f)
                reflectiveCurveToRelative(-56f, 25.072f, -56f, 56f)
                curveToRelative(0f, 4.797f, 0.605f, 9.453f, 1.74f, 13.897f)
                lineToRelative(-67.958f, 40.775f)
                curveTo(171.823f, 205.561f, 158.562f, 200f, 144f, 200f)
                curveToRelative(-30.928f, 0f, -56f, 25.072f, -56f, 56f)
                reflectiveCurveToRelative(25.072f, 56f, 56f, 56f)
                curveToRelative(14.562f, 0f, 27.823f, -5.561f, 37.783f, -14.671f)
                lineToRelative(67.958f, 40.775f)
                arcToRelative(56.088f, 56.088f, 0f, false, false, -1.74f, 13.897f)
                curveToRelative(0f, 30.928f, 25.072f, 56f, 56f, 56f)
                reflectiveCurveToRelative(56f, -25.072f, 56f, -56f)
                curveTo(360f, 321.072f, 334.928f, 296f, 304f, 296f)
                close()
            }
        }.build()
        
        return _ShareAltSquare!!
    }

private var _ShareAltSquare: ImageVector? = null

