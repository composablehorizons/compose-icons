package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HospitalSymbol: ImageVector
    get() {
        if (_HospitalSymbol != null) return _HospitalSymbol!!
        
        _HospitalSymbol = ImageVector.Builder(
            name = "hospital-symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 0f)
                curveTo(114.6f, 0f, 0f, 114.6f, 0f, 256f)
                reflectiveCurveToRelative(114.6f, 256f, 256f, 256f)
                reflectiveCurveToRelative(256f, -114.6f, 256f, -256f)
                reflectiveCurveTo(397.4f, 0f, 256f, 0f)
                close()
                moveToRelative(112f, 376f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-88f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(88f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineToRelative(-48f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineTo(136f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(-88f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _HospitalSymbol!!
    }

private var _HospitalSymbol: ImageVector? = null

