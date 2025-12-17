package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Laugh: ImageVector
    get() {
        if (_Laugh != null) return _Laugh!!
        
        _Laugh = ImageVector.Builder(
            name = "laugh",
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
                moveToRelative(80f, 152f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                close()
                moveToRelative(-160f, 0f)
                curveToRelative(17.7f, 0f, 32f, 14.3f, 32f, 32f)
                reflectiveCurveToRelative(-14.3f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.3f, -32f, -32f)
                reflectiveCurveToRelative(14.3f, -32f, 32f, -32f)
                close()
                moveToRelative(88f, 272f)
                horizontalLineToRelative(-16f)
                curveToRelative(-73.4f, 0f, -134f, -55f, -142.9f, -126f)
                curveToRelative(-1.2f, -9.5f, 6.3f, -18f, 15.9f, -18f)
                horizontalLineToRelative(270f)
                curveToRelative(9.6f, 0f, 17.1f, 8.4f, 15.9f, 18f)
                curveToRelative(-8.9f, 71f, -69.5f, 126f, -142.9f, 126f)
                close()
            }
        }.build()
        
        return _Laugh!!
    }

private var _Laugh: ImageVector? = null

