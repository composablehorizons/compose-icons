package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Design_services: ImageVector
    get() {
        if (_Design_services != null) return _Design_services!!
        
        _Design_services = ImageVector.Builder(
            name = "design_services",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352f, 438f)
                lineToRelative(86f, -87f)
                lineToRelative(-56f, -57f)
                lineToRelative(-44f, 44f)
                lineToRelative(-56f, -56f)
                lineToRelative(43f, -44f)
                lineToRelative(-45f, -45f)
                lineToRelative(-87f, 87f)
                lineToRelative(159f, 158f)
                close()
                moveToRelative(328f, 329f)
                lineToRelative(87f, -87f)
                lineToRelative(-45f, -45f)
                lineToRelative(-44f, 43f)
                lineToRelative(-56f, -56f)
                lineToRelative(43f, -44f)
                lineToRelative(-57f, -56f)
                lineToRelative(-86f, 86f)
                lineToRelative(158f, 159f)
                close()
                moveToRelative(24f, -567f)
                lineToRelative(57f, 57f)
                lineToRelative(-57f, -57f)
                close()
                moveTo(290f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-170f)
                lineToRelative(175f, -175f)
                lineTo(80f, 280f)
                lineToRelative(200f, -200f)
                lineToRelative(216f, 216f)
                lineToRelative(151f, -152f)
                quadToRelative(12f, -12f, 27f, -18f)
                reflectiveQuadToRelative(31f, -6f)
                quadToRelative(16f, 0f, 31f, 6f)
                reflectiveQuadToRelative(27f, 18f)
                lineToRelative(53f, 54f)
                quadToRelative(12f, 12f, 18f, 27f)
                reflectiveQuadToRelative(6f, 31f)
                quadToRelative(0f, 16f, -6f, 30.5f)
                reflectiveQuadTo(816f, 313f)
                lineTo(665f, 465f)
                lineToRelative(215f, 215f)
                lineTo(680f, 880f)
                lineTo(465f, 665f)
                lineTo(290f, 840f)
                close()
                moveToRelative(-90f, -80f)
                horizontalLineToRelative(56f)
                lineToRelative(392f, -391f)
                lineToRelative(-57f, -57f)
                lineToRelative(-391f, 392f)
                verticalLineToRelative(56f)
                close()
                moveToRelative(420f, -419f)
                lineToRelative(-29f, -29f)
                lineToRelative(57f, 57f)
                lineToRelative(-28f, -28f)
                close()
            }
        }.build()
        
        return _Design_services!!
    }

private var _Design_services: ImageVector? = null

