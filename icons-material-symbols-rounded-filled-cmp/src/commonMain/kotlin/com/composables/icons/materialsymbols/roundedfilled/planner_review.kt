package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Planner_review: ImageVector
    get() {
        if (_Planner_review != null) return _Planner_review!!
        
        _Planner_review = ImageVector.Builder(
            name = "planner_review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(208f, 640f)
                lineToRelative(106f, -490f)
                quadToRelative(3f, -14f, 13.5f, -22f)
                reflectiveQuadToRelative(24.5f, -8f)
                horizontalLineToRelative(17f)
                quadToRelative(14f, 0f, 24.5f, 8.5f)
                reflectiveQuadTo(407f, 151f)
                lineToRelative(115f, 541f)
                lineToRelative(71f, -302f)
                quadToRelative(3f, -13f, 13.5f, -21.5f)
                reflectiveQuadTo(631f, 360f)
                horizontalLineToRelative(19f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(13f, 21f)
                lineToRelative(65f, 251f)
                horizontalLineToRelative(88f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 720f)
                horizontalLineTo(721f)
                quadToRelative(-14f, 0f, -24.5f, -8f)
                reflectiveQuadTo(682f, 690f)
                lineToRelative(-40f, -158f)
                lineToRelative(-75f, 318f)
                quadToRelative(-3f, 14f, -13.5f, 22f)
                reflectiveQuadTo(529f, 880f)
                horizontalLineToRelative(-17f)
                quadToRelative(-14f, 0f, -25f, -8.5f)
                reflectiveQuadTo(473f, 849f)
                lineTo(360f, 318f)
                lineToRelative(-81f, 371f)
                quadToRelative(-3f, 14f, -14f, 22.5f)
                reflectiveQuadToRelative(-25f, 8.5f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 640f)
                horizontalLineToRelative(88f)
                close()
            }
        }.build()
        
        return _Planner_review!!
    }

private var _Planner_review: ImageVector? = null

