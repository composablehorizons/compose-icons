package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Identification: ImageVector
    get() {
        if (_Identification != null) return _Identification!!
        
        _Identification = ImageVector.Builder(
            name = "identification",
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
                moveTo(15f, 9f)
                horizontalLineToRelative(3.75f)
                moveTo(15f, 12f)
                horizontalLineToRelative(3.75f)
                moveTo(15f, 15f)
                horizontalLineToRelative(3.75f)
                moveTo(4.5f, 19.5f)
                horizontalLineToRelative(15f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineTo(6.75f)
                arcTo(2.25f, 2.25f, 0f, false, false, 19.5f, 4.5f)
                horizontalLineToRelative(-15f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, 2.25f)
                verticalLineToRelative(10.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4.5f, 19.5f)
                close()
                moveToRelative(6f, -10.125f)
                arcToRelative(1.875f, 1.875f, 0f, true, true, -3.75f, 0f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, 3.75f, 0f)
                close()
                moveToRelative(1.294f, 6.336f)
                arcToRelative(6.721f, 6.721f, 0f, false, true, -3.17f, 0.789f)
                arcToRelative(6.721f, 6.721f, 0f, false, true, -3.168f, -0.789f)
                arcToRelative(3.376f, 3.376f, 0f, false, true, 6.338f, 0f)
                close()
            }
        }.build()
        
        return _Identification!!
    }

private var _Identification: ImageVector? = null

