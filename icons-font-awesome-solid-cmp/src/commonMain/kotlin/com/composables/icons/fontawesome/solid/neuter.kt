package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Neuter: ImageVector
    get() {
        if (_Neuter != null) return _Neuter!!
        
        _Neuter = ImageVector.Builder(
            name = "neuter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 288f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 176f)
                curveToRelative(0f, -79.5f, -64.5f, -144f, -144f, -144f)
                reflectiveCurveTo(0f, 96.5f, 0f, 176f)
                curveToRelative(0f, 68.5f, 47.9f, 125.9f, 112f, 140.4f)
                verticalLineTo(468f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineTo(316.4f)
                curveToRelative(64.1f, -14.5f, 112f, -71.9f, 112f, -140.4f)
                close()
                moveToRelative(-144f, 80f)
                curveToRelative(-44.1f, 0f, -80f, -35.9f, -80f, -80f)
                reflectiveCurveToRelative(35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                close()
            }
        }.build()
        
        return _Neuter!!
    }

private var _Neuter: ImageVector? = null

