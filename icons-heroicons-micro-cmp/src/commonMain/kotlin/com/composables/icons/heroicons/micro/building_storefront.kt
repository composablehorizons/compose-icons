package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.BuildingStorefront: ImageVector
    get() {
        if (_BuildingStorefront != null) return _BuildingStorefront!!
        
        _BuildingStorefront = ImageVector.Builder(
            name = "building-storefront",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 7f)
                curveToRelative(0.681f, 0f, 1.3f, -0.273f, 1.75f, -0.715f)
                curveTo(6.7f, 6.727f, 7.319f, 7f, 8f, 7f)
                reflectiveCurveToRelative(1.3f, -0.273f, 1.75f, -0.715f)
                arcTo(2.5f, 2.5f, 0f, true, false, 11.5f, 2f)
                horizontalLineToRelative(-7f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
                close()
                moveTo(6.25f, 8.097f)
                arcTo(3.986f, 3.986f, 0f, false, true, 4.5f, 8.5f)
                curveToRelative(-0.53f, 0f, -1.037f, -0.103f, -1.5f, -0.29f)
                verticalLineToRelative(4.29f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.754f, 0.754f, 0f, false, false, 0.138f, -0.013f)
                arcTo(0.5f, 0.5f, 0f, false, false, 3.5f, 14f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 10f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.112f, -0.013f)
                curveToRelative(0.045f, 0.009f, 0.09f, 0.013f, 0.138f, 0.013f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineTo(13f)
                verticalLineTo(8.21f)
                curveToRelative(-0.463f, 0.187f, -0.97f, 0.29f, -1.5f, 0.29f)
                arcToRelative(3.986f, 3.986f, 0f, false, true, -1.75f, -0.403f)
                arcTo(3.986f, 3.986f, 0f, false, true, 8f, 8.5f)
                arcToRelative(3.986f, 3.986f, 0f, false, true, -1.75f, -0.403f)
                close()
            }
        }.build()
        
        return _BuildingStorefront!!
    }

private var _BuildingStorefront: ImageVector? = null

