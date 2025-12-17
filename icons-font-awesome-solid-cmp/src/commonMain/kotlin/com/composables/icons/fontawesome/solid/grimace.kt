package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Grimace: ImageVector
    get() {
        if (_Grimace != null) return _Grimace!!
        
        _Grimace = ImageVector.Builder(
            name = "grimace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(248f, 8f)
                curveTo(111f, 8f, 0f, 119f, 0f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(385f, 8f, 248f, 8f)
                close()
                moveTo(144f, 400f)
                horizontalLineToRelative(-8f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -56f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -17.7f, 14.3f, -32f, 32f, -32f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-8f, -136f)
                curveToRelative(0f, -17.7f, 14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                close()
                moveToRelative(72f, 192f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -56f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(64f, 56f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -56f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(64f, 56f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -56f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-8f, -104f)
                curveToRelative(-17.7f, 0f, -32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                close()
                moveToRelative(64f, 128f)
                curveToRelative(0f, 17.7f, -14.3f, 32f, -32f, 32f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(0f, -24f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(8f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Grimace!!
    }

private var _Grimace: ImageVector? = null

