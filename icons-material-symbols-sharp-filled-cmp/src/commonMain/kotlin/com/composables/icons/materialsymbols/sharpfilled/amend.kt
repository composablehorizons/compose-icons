package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Amend: ImageVector
    get() {
        if (_Amend != null) return _Amend!!
        
        _Amend = ImageVector.Builder(
            name = "amend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-57f)
                quadToRelative(20f, -19f, 45f, -29.5f)
                reflectiveQuadToRelative(52f, -10.5f)
                quadToRelative(47f, 0f, 83.5f, 27.5f)
                reflectiveQuadTo(614f, 480f)
                horizontalLineToRelative(62f)
                quadToRelative(-14f, -70f, -69f, -115f)
                reflectiveQuadToRelative(-127f, -45f)
                quadToRelative(-39f, 0f, -75.5f, 15f)
                reflectiveQuadTo(340f, 378f)
                verticalLineToRelative(-58f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(160f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Amend!!
    }

private var _Amend: ImageVector? = null

