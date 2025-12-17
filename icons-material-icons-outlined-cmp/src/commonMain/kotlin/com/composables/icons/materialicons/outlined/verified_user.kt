package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Verified_user: ImageVector
    get() {
        if (_Verified_user != null) return _Verified_user!!
        
        _Verified_user = ImageVector.Builder(
            name = "verified_user",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 5.55f, 3.84f, 10.74f, 9f, 12f)
                curveToRelative(5.16f, -1.26f, 9f, -6.45f, 9f, -12f)
                verticalLineTo(5f)
                lineToRelative(-9f, -4f)
                close()
                moveToRelative(7f, 10f)
                curveToRelative(0f, 4.52f, -2.98f, 8.69f, -7f, 9.93f)
                curveToRelative(-4.02f, -1.24f, -7f, -5.41f, -7f, -9.93f)
                verticalLineTo(6.3f)
                lineToRelative(7f, -3.11f)
                lineToRelative(7f, 3.11f)
                verticalLineTo(11f)
                close()
                moveToRelative(-11.59f, 0.59f)
                lineTo(6f, 13f)
                lineToRelative(4f, 4f)
                lineToRelative(8f, -8f)
                lineToRelative(-1.41f, -1.42f)
                lineTo(10f, 14.17f)
                close()
            }
        }.build()
        
        return _Verified_user!!
    }

private var _Verified_user: ImageVector? = null

