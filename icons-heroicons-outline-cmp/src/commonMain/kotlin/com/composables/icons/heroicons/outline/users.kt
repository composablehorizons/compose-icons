package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Users: ImageVector
    get() {
        if (_Users != null) return _Users!!
        
        _Users = ImageVector.Builder(
            name = "users",
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
                moveTo(15f, 19.128f)
                arcToRelative(9.38f, 9.38f, 0f, false, false, 2.625f, 0.372f)
                arcToRelative(9.337f, 9.337f, 0f, false, false, 4.121f, -0.952f)
                arcToRelative(4.125f, 4.125f, 0f, false, false, -7.533f, -2.493f)
                moveTo(15f, 19.128f)
                verticalLineToRelative(-0.003f)
                curveToRelative(0f, -1.113f, -0.285f, -2.16f, -0.786f, -3.07f)
                moveTo(15f, 19.128f)
                verticalLineToRelative(0.106f)
                arcTo(12.318f, 12.318f, 0f, false, true, 8.624f, 21f)
                curveToRelative(-2.331f, 0f, -4.512f, -0.645f, -6.374f, -1.766f)
                lineToRelative(-0.001f, -0.109f)
                arcToRelative(6.375f, 6.375f, 0f, false, true, 11.964f, -3.07f)
                moveTo(12f, 6.375f)
                arcToRelative(3.375f, 3.375f, 0f, true, true, -6.75f, 0f)
                arcToRelative(3.375f, 3.375f, 0f, false, true, 6.75f, 0f)
                close()
                moveToRelative(8.25f, 2.25f)
                arcToRelative(2.625f, 2.625f, 0f, true, true, -5.25f, 0f)
                arcToRelative(2.625f, 2.625f, 0f, false, true, 5.25f, 0f)
                close()
            }
        }.build()
        
        return _Users!!
    }

private var _Users: ImageVector? = null

