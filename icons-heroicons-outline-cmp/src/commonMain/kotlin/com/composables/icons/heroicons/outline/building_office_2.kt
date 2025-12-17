package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BuildingOffice2: ImageVector
    get() {
        if (_BuildingOffice2 != null) return _BuildingOffice2!!
        
        _BuildingOffice2 = ImageVector.Builder(
            name = "building-office-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(2.25f, 21f)
                horizontalLineToRelative(19.5f)
                moveToRelative(-18f, -18f)
                verticalLineToRelative(18f)
                moveToRelative(10.5f, -18f)
                verticalLineToRelative(18f)
                moveToRelative(6f, -13.5f)
                verticalLineTo(21f)
                moveTo(6.75f, 6.75f)
                horizontalLineToRelative(0.75f)
                moveToRelative(-0.75f, 3f)
                horizontalLineToRelative(0.75f)
                moveToRelative(-0.75f, 3f)
                horizontalLineToRelative(0.75f)
                moveToRelative(3f, -6f)
                horizontalLineToRelative(0.75f)
                moveToRelative(-0.75f, 3f)
                horizontalLineToRelative(0.75f)
                moveToRelative(-0.75f, 3f)
                horizontalLineToRelative(0.75f)
                moveTo(6.75f, 21f)
                verticalLineToRelative(-3.375f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineTo(21f)
                moveTo(3f, 3f)
                horizontalLineToRelative(12f)
                moveToRelative(-0.75f, 4.5f)
                horizontalLineTo(21f)
                moveToRelative(-3.75f, 3.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()
        
        return _BuildingOffice2!!
    }

private var _BuildingOffice2: ImageVector? = null

