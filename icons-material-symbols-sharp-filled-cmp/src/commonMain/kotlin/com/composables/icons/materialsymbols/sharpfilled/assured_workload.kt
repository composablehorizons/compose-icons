package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Assured_workload: ImageVector
    get() {
        if (_Assured_workload != null) return _Assured_workload!!
        
        _Assured_workload = ImageVector.Builder(
            name = "assured_workload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 680f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 320f)
                verticalLineToRelative(-80f)
                lineToRelative(400f, -200f)
                lineToRelative(400f, 200f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(482f)
                quadToRelative(2f, 21f, 5f, 40.5f)
                reflectiveQuadToRelative(9f, 39.5f)
                horizontalLineTo(80f)
                close()
                moveToRelative(600f, -310f)
                verticalLineToRelative(-130f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(90f)
                lineToRelative(-80f, 40f)
                close()
                moveTo(800f, 960f)
                quadToRelative(-69f, -17f, -114.5f, -79.5f)
                reflectiveQuadTo(640f, 742f)
                verticalLineToRelative(-102f)
                lineToRelative(160f, -80f)
                lineToRelative(160f, 80f)
                verticalLineToRelative(102f)
                quadToRelative(0f, 76f, -45.5f, 138.5f)
                reflectiveQuadTo(800f, 960f)
                close()
                moveToRelative(-29f, -120f)
                lineToRelative(139f, -138f)
                lineToRelative(-42f, -42f)
                lineToRelative(-97f, 95f)
                lineToRelative(-39f, -39f)
                lineToRelative(-42f, 43f)
                lineToRelative(81f, 81f)
                close()
            }
        }.build()
        
        return _Assured_workload!!
    }

private var _Assured_workload: ImageVector? = null

