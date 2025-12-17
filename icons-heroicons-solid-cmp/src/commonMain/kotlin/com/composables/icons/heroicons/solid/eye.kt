package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Eye: ImageVector
    get() {
        if (_Eye != null) return _Eye!!
        
        _Eye = ImageVector.Builder(
            name = "eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.323f, 11.447f)
                curveTo(2.811f, 6.976f, 7.028f, 3.75f, 12.001f, 3.75f)
                curveToRelative(4.97f, 0f, 9.185f, 3.223f, 10.675f, 7.69f)
                curveToRelative(0.12f, 0.362f, 0.12f, 0.752f, 0f, 1.113f)
                curveToRelative(-1.487f, 4.471f, -5.705f, 7.697f, -10.677f, 7.697f)
                curveToRelative(-4.97f, 0f, -9.186f, -3.223f, -10.675f, -7.69f)
                arcToRelative(1.762f, 1.762f, 0f, false, true, 0f, -1.113f)
                close()
                moveTo(17.25f, 12f)
                arcToRelative(5.25f, 5.25f, 0f, true, true, -10.5f, 0f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, 10.5f, 0f)
                close()
            }
        }.build()
        
        return _Eye!!
    }

private var _Eye: ImageVector? = null

