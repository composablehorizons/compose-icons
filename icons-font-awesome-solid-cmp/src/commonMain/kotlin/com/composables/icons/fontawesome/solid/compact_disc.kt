package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CompactDisc: ImageVector
    get() {
        if (_CompactDisc != null) return _CompactDisc!!
        
        _CompactDisc = ImageVector.Builder(
            name = "compact-disc",
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
                moveTo(88f, 256f)
                horizontalLineTo(56f)
                curveToRelative(0f, -105.9f, 86.1f, -192f, 192f, -192f)
                verticalLineToRelative(32f)
                curveToRelative(-88.2f, 0f, -160f, 71.8f, -160f, 160f)
                close()
                moveToRelative(160f, 96f)
                curveToRelative(-53f, 0f, -96f, -43f, -96f, -96f)
                reflectiveCurveToRelative(43f, -96f, 96f, -96f)
                reflectiveCurveToRelative(96f, 43f, 96f, 96f)
                reflectiveCurveToRelative(-43f, 96f, -96f, 96f)
                close()
                moveToRelative(0f, -128f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                reflectiveCurveToRelative(14.3f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.3f, 32f, -32f)
                reflectiveCurveToRelative(-14.3f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _CompactDisc!!
    }

private var _CompactDisc: ImageVector? = null

