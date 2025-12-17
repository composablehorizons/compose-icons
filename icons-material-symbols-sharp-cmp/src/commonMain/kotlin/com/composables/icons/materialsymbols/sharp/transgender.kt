package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Transgender: ImageVector
    get() {
        if (_Transgender != null) return _Transgender!!
        
        _Transgender = ImageVector.Builder(
            name = "transgender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveTo(440f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-84f)
                quadToRelative(-78f, -14f, -129f, -75f)
                reflectiveQuadToRelative(-51f, -141f)
                quadToRelative(0f, -33f, 9.5f, -65f)
                reflectiveQuadToRelative(28.5f, -59f)
                lineToRelative(-26f, -26f)
                lineToRelative(-56f, 56f)
                lineToRelative(-56f, -56f)
                lineToRelative(56f, -57f)
                lineToRelative(-76f, -76f)
                verticalLineToRelative(103f)
                horizontalLineTo(60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(197f)
                lineToRelative(76f, 76f)
                lineToRelative(57f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 57f)
                lineToRelative(26f, 26f)
                quadToRelative(27f, -20f, 59f, -29.5f)
                reflectiveQuadToRelative(65f, -9.5f)
                quadToRelative(33f, 0f, 65f, 9.5f)
                reflectiveQuadToRelative(59f, 29.5f)
                lineToRelative(159f, -159f)
                horizontalLineTo(660f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-103f)
                lineTo(661f, 335f)
                quadToRelative(19f, 28f, 29f, 59.5f)
                reflectiveQuadToRelative(10f, 65.5f)
                quadToRelative(0f, 80f, -51f, 141f)
                reflectiveQuadToRelative(-129f, 75f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Transgender!!
    }

private var _Transgender: ImageVector? = null

