package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Raw_on: ImageVector
    get() {
        if (_Raw_on != null) return _Raw_on!!
        
        _Raw_on = ImageVector.Builder(
            name = "raw_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 18f, -9.5f, 32.5f)
                reflectiveQuadTo(284f, 516f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-60f)
                lineToRelative(-36f, -80f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(230f, 0f)
                lineToRelative(60f, -240f)
                horizontalLineToRelative(100f)
                lineToRelative(60f, 240f)
                horizontalLineToRelative(-60f)
                lineToRelative(-14f, -60f)
                horizontalLineToRelative(-70f)
                lineToRelative(-16f, 60f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(270f, 0f)
                lineToRelative(-60f, -240f)
                horizontalLineToRelative(60f)
                lineToRelative(30f, 120f)
                lineToRelative(30f, -120f)
                horizontalLineToRelative(60f)
                lineToRelative(30f, 120f)
                lineToRelative(30f, -120f)
                horizontalLineToRelative(60f)
                lineToRelative(-60f, 240f)
                horizontalLineToRelative(-60f)
                lineToRelative(-30f, -122f)
                lineToRelative(-30f, 122f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(440f, 480f)
                horizontalLineToRelative(40f)
                lineToRelative(-10f, -40f)
                horizontalLineToRelative(-20f)
                lineToRelative(-10f, 40f)
                close()
                moveToRelative(-260f, -20f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Raw_on!!
    }

private var _Raw_on: ImageVector? = null

