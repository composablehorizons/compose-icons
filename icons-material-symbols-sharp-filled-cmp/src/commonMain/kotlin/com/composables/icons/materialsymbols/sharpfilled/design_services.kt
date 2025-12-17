package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Design_services: ImageVector
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
                moveToRelative(-31f, -510f)
                lineToRelative(56f, 56f)
                lineToRelative(56f, -56f)
                lineToRelative(-57f, -57f)
                lineToRelative(-55f, 57f)
                close()
                moveTo(290f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-170f)
                lineToRelative(175f, -175f)
                lineTo(80f, 280f)
                lineToRelative(200f, -200f)
                lineToRelative(216f, 216f)
                lineToRelative(209f, -210f)
                lineToRelative(168f, 170f)
                lineToRelative(-208f, 209f)
                lineToRelative(215f, 215f)
                lineTo(680f, 880f)
                lineTo(465f, 665f)
                lineTo(290f, 840f)
                close()
            }
        }.build()
        
        return _Design_services!!
    }

private var _Design_services: ImageVector? = null

