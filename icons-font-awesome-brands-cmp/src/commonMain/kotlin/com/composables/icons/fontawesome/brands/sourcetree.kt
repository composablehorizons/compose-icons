package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Sourcetree: ImageVector
    get() {
        if (_Sourcetree != null) return _Sourcetree!!
        
        _Sourcetree = ImageVector.Builder(
            name = "sourcetree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(427.2f, 203f)
                curveToRelative(0f, -112.1f, -90.9f, -203f, -203f, -203f)
                curveTo(112.1f, -0.2f, 21.2f, 90.6f, 21f, 202.6f)
                arcTo(202.86f, 202.86f, 0f, false, false, 161.5f, 396f)
                verticalLineToRelative(101.7f)
                arcToRelative(14.3f, 14.3f, 0f, false, false, 14.3f, 14.3f)
                horizontalLineToRelative(96.4f)
                arcToRelative(14.3f, 14.3f, 0f, false, false, 14.3f, -14.3f)
                verticalLineTo(396.1f)
                arcTo(203.18f, 203.18f, 0f, false, false, 427.2f, 203f)
                close()
                moveToRelative(-271.6f, 0f)
                curveToRelative(0f, -90.8f, 137.3f, -90.8f, 137.3f, 0f)
                curveToRelative(-0.1f, 89.9f, -137.3f, 91f, -137.3f, 0f)
                close()
            }
        }.build()
        
        return _Sourcetree!!
    }

private var _Sourcetree: ImageVector? = null

