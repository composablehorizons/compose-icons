package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BuildingOffice: ImageVector
    get() {
        if (_BuildingOffice != null) return _BuildingOffice!!
        
        _BuildingOffice = ImageVector.Builder(
            name = "building-office",
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
                moveTo(3.75f, 21f)
                horizontalLineToRelative(16.5f)
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                moveTo(5.25f, 3f)
                verticalLineToRelative(18f)
                moveToRelative(13.5f, -18f)
                verticalLineToRelative(18f)
                moveTo(9f, 6.75f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-1.5f, 3f)
                horizontalLineToRelative(1.5f)
                moveToRelative(-1.5f, 3f)
                horizontalLineToRelative(1.5f)
                moveToRelative(3f, -6f)
                horizontalLineTo(15f)
                moveToRelative(-1.5f, 3f)
                horizontalLineTo(15f)
                moveToRelative(-1.5f, 3f)
                horizontalLineTo(15f)
                moveTo(9f, 21f)
                verticalLineToRelative(-3.375f)
                curveToRelative(0f, -0.621f, 0.504f, -1.125f, 1.125f, -1.125f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineTo(21f)
            }
        }.build()
        
        return _BuildingOffice!!
    }

private var _BuildingOffice: ImageVector? = null

