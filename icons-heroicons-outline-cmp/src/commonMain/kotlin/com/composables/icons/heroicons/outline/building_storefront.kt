package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.BuildingStorefront: ImageVector
    get() {
        if (_BuildingStorefront != null) return _BuildingStorefront!!
        
        _BuildingStorefront = ImageVector.Builder(
            name = "building-storefront",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(13.5f, 21f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(21f)
                moveToRelative(-4.5f, 0f)
                horizontalLineTo(2.36f)
                moveToRelative(11.14f, 0f)
                horizontalLineTo(18f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.64f)
                moveToRelative(-1.39f, 0f)
                verticalLineTo(9.349f)
                moveTo(3.75f, 21f)
                verticalLineTo(9.349f)
                moveToRelative(0f, 0f)
                arcToRelative(3.001f, 3.001f, 0f, false, false, 3.75f, -0.615f)
                arcTo(2.993f, 2.993f, 0f, false, false, 9.75f, 9.75f)
                curveToRelative(0.896f, 0f, 1.7f, -0.393f, 2.25f, -1.016f)
                arcToRelative(2.993f, 2.993f, 0f, false, false, 2.25f, 1.016f)
                curveToRelative(0.896f, 0f, 1.7f, -0.393f, 2.25f, -1.015f)
                arcToRelative(3.001f, 3.001f, 0f, false, false, 3.75f, 0.614f)
                moveToRelative(-16.5f, 0f)
                arcToRelative(3.004f, 3.004f, 0f, false, true, -0.621f, -4.72f)
                lineToRelative(1.189f, -1.19f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.378f, 3f)
                horizontalLineToRelative(13.243f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.06f, 0.44f)
                lineToRelative(1.19f, 1.189f)
                arcToRelative(3f, 3f, 0f, false, true, -0.621f, 4.72f)
                moveTo(6.75f, 18f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(13.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _BuildingStorefront!!
    }

private var _BuildingStorefront: ImageVector? = null

