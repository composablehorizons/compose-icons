package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Identification: ImageVector
    get() {
        if (_Identification != null) return _Identification!!
        
        _Identification = ImageVector.Builder(
            name = "identification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(2.5f, 5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                close()
                moveTo(10f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveToRelative(0.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(10f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 8f)
                close()
                moveToRelative(-2.378f, 3f)
                curveToRelative(0.346f, 0f, 0.583f, -0.343f, 0.395f, -0.633f)
                arcTo(2.998f, 2.998f, 0f, false, false, 5.5f, 9f)
                arcToRelative(2.998f, 2.998f, 0f, false, false, -2.517f, 1.367f)
                curveToRelative(-0.188f, 0.29f, 0.05f, 0.633f, 0.395f, 0.633f)
                horizontalLineToRelative(4.244f)
                close()
            }
        }.build()
        
        return _Identification!!
    }

private var _Identification: ImageVector? = null

