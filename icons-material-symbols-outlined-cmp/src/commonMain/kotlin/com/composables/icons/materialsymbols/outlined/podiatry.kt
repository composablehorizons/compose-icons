package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Podiatry: ImageVector
    get() {
        if (_Podiatry != null) return _Podiatry!!
        
        _Podiatry = ImageVector.Builder(
            name = "podiatry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(684f, 571f)
                lineToRelative(179f, -179f)
                lineToRelative(57f, 57f)
                lineToRelative(-180f, 179f)
                lineToRelative(-56f, -57f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-106f)
                quadToRelative(0f, -24f, 13.5f, -44f)
                reflectiveQuadTo(90f, 621f)
                quadToRelative(21f, -8f, 40f, -19f)
                reflectiveQuadToRelative(38f, -25f)
                lineToRelative(58f, 58f)
                quadToRelative(5f, 7f, 13.5f, 6.5f)
                reflectiveQuadTo(254f, 635f)
                quadToRelative(5f, -5f, 5f, -13.5f)
                reflectiveQuadToRelative(-5f, -15.5f)
                lineToRelative(-55f, -55f)
                lineToRelative(15.5f, -15.5f)
                quadTo(222f, 528f, 230f, 519f)
                lineToRelative(54f, 55f)
                quadToRelative(5f, 7f, 13.5f, 7f)
                reflectiveQuadToRelative(15.5f, -7f)
                quadToRelative(5f, -5f, 5f, -13.5f)
                reflectiveQuadToRelative(-5f, -15.5f)
                lineToRelative(-55f, -54f)
                quadToRelative(5f, -10f, 10.5f, -20.5f)
                reflectiveQuadTo(278f, 448f)
                lineToRelative(65f, 65f)
                quadToRelative(5f, 7f, 13.5f, 7f)
                reflectiveQuadToRelative(15.5f, -7f)
                quadToRelative(5f, -5f, 5f, -13f)
                reflectiveQuadToRelative(-5f, -15f)
                lineToRelative(-77f, -77f)
                lineToRelative(41f, -114f)
                lineToRelative(216f, -214f)
                lineToRelative(282f, 283f)
                lineToRelative(-414f, 437f)
                horizontalLineTo(40f)
                close()
                moveToRelative(345f, -80f)
                lineToRelative(337f, -355f)
                lineToRelative(-337f, 355f)
                close()
                moveToRelative(-265f, 0f)
                horizontalLineToRelative(265f)
                lineToRelative(337f, -355f)
                lineToRelative(-171f, -171f)
                lineToRelative(-146f, 145f)
                lineToRelative(-29f, 81f)
                lineToRelative(30f, 30f)
                quadToRelative(23f, 24f, 23f, 57.5f)
                reflectiveQuadTo(406f, 564f)
                lineTo(293f, 677f)
                quadToRelative(-24f, 24f, -57f, 24f)
                reflectiveQuadToRelative(-56f, -24f)
                lineToRelative(-8f, -8f)
                quadToRelative(-13f, 8f, -26f, 14f)
                reflectiveQuadToRelative(-26f, 11f)
                verticalLineToRelative(26f)
                close()
            }
        }.build()
        
        return _Podiatry!!
    }

private var _Podiatry: ImageVector? = null

